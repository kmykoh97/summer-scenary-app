package com.example.translate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends ToolbarActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setToolbar() {

    }

    @Override
    protected void initView() {
        //设置返回键图标并处理点击事件
//        mToolbar.setNavigationIcon(R.mipmap.ic_launcher_round);
//        mToolbar.setNavigationOnClickListener(null);

        //设置返回键不显示
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        //回调刷新toolbar的menu，页面初始化或者在需要的时候调用
        invalidateOptionsMenu();
    }

    //    @OnClick({R.id.btn_swipe_refresh, R.id.btn_floating_action, R.id.btn_snack_bar, R.id.btn_tab_layout,
//            R.id.btn_card_view, R.id.bottom_navigation, R.id.scrolling_bar, R.id.text_input_layout,
//            R.id.search_view, R.id.tab_layout_custom_view, R.id.drawer_layout})
    @OnClick({R.id.search_view, R.id.drawer_layout})
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.btn_swipe_refresh:
//                openActivity(SwipeRefreshLayoutActivity.class);
//                break;
//            case R.id.btn_floating_action:
//                openActivity(FloatingActionButtonActivity.class);
//                break;
//            case R.id.btn_snack_bar:
//                openActivity(SnackbarActivity.class);
//                break;
//            case R.id.btn_tab_layout:
//                openActivity(TabLayoutActivity.class);
//                break;
//            case R.id.btn_card_view:
//                openActivity(CardViewActivity.class);
//                break;
//            case R.id.bottom_navigation:
//                //openActivity(MyDialogActivity.class);
//                openActivity(BottomNavigationActivity.class);
//                break;
//            case R.id.scrolling_bar:
//                openActivity(ScrollingActivity.class);
//                break;
//            case R.id.text_input_layout:
//                openActivity(TextInputLayoutActivity.class);
//                break;
            case R.id.search_view:
                openActivity(SearchViewActivity.class);
                break;
//            case R.id.tab_layout_custom_view:
//                openActivity(TabLayoutCustomViewActivity.class);
//                break;
            case R.id.drawer_layout:
                openActivity(DrawerLayoutActivity.class);
                break;
        }
    }

    /**
     * 重写onPrepareOptionsMenu，处理toolbar的menu，此处把搜索按钮去掉
     */
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        //menu.findItem(R.id.action_search).setVisible(false);
        return super.onPrepareOptionsMenu(menu);
    }

    private void openActivity(Class<?> targetActivityClass) {
        startActivity(new Intent(MainActivity.this, targetActivityClass));
    }
}
