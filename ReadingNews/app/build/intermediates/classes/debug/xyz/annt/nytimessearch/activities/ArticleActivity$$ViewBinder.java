// Generated code from Butter Knife. Do not modify!
package xyz.annt.nytimessearch.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleActivity$$ViewBinder<T extends xyz.annt.nytimessearch.activities.ArticleActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558508, "field 'wvArticle'");
    target.wvArticle = finder.castView(view, 2131558508, "field 'wvArticle'");
    view = finder.findRequiredView(source, 2131558509, "field 'pbLoading'");
    target.pbLoading = finder.castView(view, 2131558509, "field 'pbLoading'");
  }

  @Override public void unbind(T target) {
    target.wvArticle = null;
    target.pbLoading = null;
  }
}
