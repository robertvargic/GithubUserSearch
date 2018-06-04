package com.robertvargic.githubusersearch.ui.userlistsearch

import com.robertvargic.githubusersearch.model.User
import com.robertvargic.githubusersearch.ui.base.BasePresenter
import com.robertvargic.githubusersearch.ui.base.BaseView

interface UserListSearchContract {

    interface View : BaseView<Presenter> {
        fun initEmptyState()
        fun initNoResultState()
        fun showProgress()
        fun hideProgress()
        fun initListView(userList: MutableList<User>)
    }

    interface Presenter : BasePresenter {
        fun searchForUser(searchQuery: String)
    }
}