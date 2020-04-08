package com.experiment.employee.presentation.employeelist.view

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.experiment.employee.R
import com.experiment.employee.databinding.ActivityEmployeeListBinding
import com.experiment.employee.presentation.core.BaseActivity
import com.experiment.employee.presentation.employeelist.viewmodel.EmployeeListFactory
import com.experiment.employee.presentation.employeelist.viewmodel.EmployeeListViewModel

//http://dummy.restapiexample.com/
class EmployeeListActivity : BaseActivity() {

    private var activityEmployeeListBinding: ActivityEmployeeListBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityEmployeeListBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_employee_list)

        activityEmployeeListBinding?.viewmodel = ViewModelProvider(
            this,
            EmployeeListFactory()
        ).get(EmployeeListViewModel::class.java)

        supportActionBar?.hide()
    }
}