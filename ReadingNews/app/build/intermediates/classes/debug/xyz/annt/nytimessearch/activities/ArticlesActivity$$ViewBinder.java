// Generated code from Butter Knife. Do not modify!
package xyz.annt.nytimessearch.activities;

import android.content.res.Resources;
import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticlesActivity$$ViewBinder<T extends xyz.annt.nytimessearch.activities.ArticlesActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558510, "field 'rvArticles'");
    target.rvArticles = finder.castView(view, 2131558510, "field 'rvArticles'");
    view = finder.findRequiredView(source, 2131558511, "field 'tvMessage'");
    target.tvMessage = finder.castView(view, 2131558511, "field 'tvMessage'");
    view = finder.findRequiredView(source, 2131558512, "field 'tvErrorMessage'");
    target.tvErrorMessage = finder.castView(view, 2131558512, "field 'tvErrorMessage'");
    view = finder.findRequiredView(source, 2131558509, "field 'pbLoading'");
    target.pbLoading = finder.castView(view, 2131558509, "field 'pbLoading'");
    Resources res = finder.getContext(source).getResources();
    target.stringNoNetwork = res.getString(2131099678);
    target.stringErrorOccurred = res.getString(2131099669);
    target.stringNotFound = res.getString(2131099680);
  }

  @Override public void unbind(T target) {
    target.rvArticles = null;
    target.tvMessage = null;
    target.tvErrorMessage = null;
    target.pbLoading = null;
  }
}
