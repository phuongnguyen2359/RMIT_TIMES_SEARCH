// Generated code from Butter Knife. Do not modify!
package xyz.annt.nytimessearch.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleSearchFragment$$ViewBinder<T extends xyz.annt.nytimessearch.fragments.ArticleSearchFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558524, "field 'tvBeginDateValue' and method 'onBeginDateClick'");
    target.tvBeginDateValue = finder.castView(view, 2131558524, "field 'tvBeginDateValue'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBeginDateClick();
        }
      });
    view = finder.findRequiredView(source, 2131558525, "field 'ivRemoveBeginDate' and method 'removeBeginTimestamp'");
    target.ivRemoveBeginDate = finder.castView(view, 2131558525, "field 'ivRemoveBeginDate'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.removeBeginTimestamp();
        }
      });
    view = finder.findRequiredView(source, 2131558527, "field 'spSort'");
    target.spSort = finder.castView(view, 2131558527, "field 'spSort'");
    view = finder.findRequiredView(source, 2131558529, "field 'cbNewsDeskArts'");
    target.cbNewsDeskArts = finder.castView(view, 2131558529, "field 'cbNewsDeskArts'");
    view = finder.findRequiredView(source, 2131558530, "field 'cbNewsDeskFashionStyle'");
    target.cbNewsDeskFashionStyle = finder.castView(view, 2131558530, "field 'cbNewsDeskFashionStyle'");
    view = finder.findRequiredView(source, 2131558531, "field 'cbNewsDeskSports'");
    target.cbNewsDeskSports = finder.castView(view, 2131558531, "field 'cbNewsDeskSports'");
  }

  @Override public void unbind(T target) {
    target.tvBeginDateValue = null;
    target.ivRemoveBeginDate = null;
    target.spSort = null;
    target.cbNewsDeskArts = null;
    target.cbNewsDeskFashionStyle = null;
    target.cbNewsDeskSports = null;
  }
}
