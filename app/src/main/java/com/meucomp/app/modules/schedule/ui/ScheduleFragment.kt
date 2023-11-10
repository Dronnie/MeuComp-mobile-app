package com.meucomp.app.modules.schedule.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.viewModels
import com.meucomp.app.R
import com.meucomp.app.appcomponents.base.BaseFragment
import com.meucomp.app.databinding.FragmentScheduleBinding
import com.meucomp.app.modules.registros.ui.RegistrosActivity
import com.meucomp.app.modules.schedule.`data`.model.ScheduleRowModel
import com.meucomp.app.modules.schedule.`data`.viewmodel.ScheduleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScheduleFragment : BaseFragment<FragmentScheduleBinding>(R.layout.fragment_schedule) {
  private val viewModel: ScheduleVM by viewModels<ScheduleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val scheduleAdapter = ScheduleAdapter(viewModel.scheduleList.value?:mutableListOf())
    binding.recyclerSchedule.adapter = scheduleAdapter
    scheduleAdapter.setOnItemClickListener(
    object : ScheduleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ScheduleRowModel) {
        onClickRecyclerSchedule(view, position, item)
      }
    }
    )
    viewModel.scheduleList.observe(requireActivity()) {
      scheduleAdapter.updateData(it)
    }
    binding.scheduleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imagePlus.setOnClickListener {
      val destIntent = RegistrosActivity.getIntent(requireActivity(), null)
      destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
      startActivity(destIntent)
      val fm = requireActivity().supportFragmentManager
      fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }
  }

  fun onClickRecyclerSchedule(
    view: View,
    position: Int,
    item: ScheduleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SCHEDULE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ScheduleFragment {
      val fragment = ScheduleFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
