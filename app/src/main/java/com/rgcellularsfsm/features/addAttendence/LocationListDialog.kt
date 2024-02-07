package com.rgcellularsfsm.features.addAttendence

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import com.rgcellularsfsm.R
import com.rgcellularsfsm.features.addAttendence.model.LocationDataModel
import com.rgcellularsfsm.widgets.AppCustomEditText
import com.rgcellularsfsm.widgets.AppCustomTextView

/**
 * Created by Saikat on 14-May-20.
 */
class LocationListDialog : DialogFragment() {

    private lateinit var rv_common_dialog_list: RecyclerView
    private lateinit var mContext: Context
    private lateinit var dialog_header_TV: AppCustomTextView
    private lateinit var et_search: AppCustomEditText
    private var adapter: LocationListAdapter? = null
    private lateinit var iv_close_icon: ImageView
    private var locList: ArrayList<LocationDataModel>?= null

    companion object {

        private lateinit var onSelectItem: (LocationDataModel) -> Unit

        fun newInstance(areaList: ArrayList<LocationDataModel>?, function: (LocationDataModel) -> Unit): LocationListDialog {
            val dialogFragment = LocationListDialog()

            onSelectItem = function

            val bundle = Bundle()
            bundle.putSerializable("loc", areaList)
            dialogFragment.arguments = bundle

            return dialogFragment
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context

        locList = arguments?.getSerializable("loc") as ArrayList<LocationDataModel>?
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        dialog?.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        dialog?.setCanceledOnTouchOutside(true)

        val v = inflater.inflate(R.layout.dialog_list, container, false)

        isCancelable = false

        initView(v)
        initTextChangeListener()
        return v
    }

    private fun initView(v: View) {
        dialog_header_TV = v.findViewById(R.id.dialog_header_TV)
        rv_common_dialog_list = v.findViewById(R.id.rv_common_dialog_list)
        rv_common_dialog_list.layoutManager = LinearLayoutManager(mContext)
        rv_common_dialog_list.visibility = View.GONE
        adapter = LocationListAdapter(mContext, locList, {
            dismiss()
            //AppUtils.hideSoftKeyboardFromDialog((mContext as DashboardActivity))
            onSelectItem(it)

        }, { isShowList: Boolean ->
            if (isShowList) {
                if (!TextUtils.isEmpty(et_search.text.toString().trim()) && et_search.text.toString().trim().length >= 3)
                    rv_common_dialog_list.visibility = View.VISIBLE
                else
                    rv_common_dialog_list.visibility = View.GONE
            } else
                rv_common_dialog_list.visibility = View.GONE
        })

        rv_common_dialog_list.adapter = adapter

        dialog_header_TV.text = "Location List"
        et_search = v.findViewById(R.id.et_search)
        iv_close_icon = v.findViewById(R.id.iv_close_icon)

        iv_close_icon.apply {
            visibility = View.VISIBLE
            setOnClickListener {
                dismiss()
            }
        }
    }

    private fun initTextChangeListener() {
        et_search.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (!TextUtils.isEmpty(et_search.text.toString().trim()) && et_search.text.toString().trim().length >= 3)
                    adapter?.filter?.filter(et_search.text.toString().trim())
            }
        })
    }
}