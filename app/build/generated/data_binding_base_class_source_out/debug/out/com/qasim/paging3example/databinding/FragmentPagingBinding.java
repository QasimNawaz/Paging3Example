// Generated by data binding compiler. Do not edit!
package com.qasim.paging3example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.qasim.paging3example.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPagingBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView listRecyclerView;

  protected FragmentPagingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView listRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.listRecyclerView = listRecyclerView;
  }

  @NonNull
  public static FragmentPagingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_paging, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPagingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPagingBinding>inflateInternal(inflater, R.layout.fragment_paging, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPagingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_paging, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPagingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPagingBinding>inflateInternal(inflater, R.layout.fragment_paging, null, false, component);
  }

  public static FragmentPagingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentPagingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPagingBinding)bind(component, view, R.layout.fragment_paging);
  }
}