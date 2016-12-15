// Generated code from Butter Knife. Do not modify!
package xyz.annt.nytimessearch.adapters;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleAdapter$ViewHolderDefault$$ViewBinder<T extends xyz.annt.nytimessearch.adapters.ArticleAdapter.ViewHolderDefault> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558532, "field 'ivThumbnail'");
    target.ivThumbnail = finder.castView(view, 2131558532, "field 'ivThumbnail'");
    view = finder.findRequiredView(source, 2131558533, "field 'tvHeadline'");
    target.tvHeadline = finder.castView(view, 2131558533, "field 'tvHeadline'");
  }

  @Override public void unbind(T target) {
    target.ivThumbnail = null;
    target.tvHeadline = null;
  }
}
