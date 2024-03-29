// Generated by view binder compiler. Do not edit!
package com.example.app.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RankingItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView udate;

  @NonNull
  public final TextView uid;

  @NonNull
  public final TextView uname;

  @NonNull
  public final TextView utime;

  private RankingItemBinding(@NonNull LinearLayout rootView, @NonNull TextView udate,
      @NonNull TextView uid, @NonNull TextView uname, @NonNull TextView utime) {
    this.rootView = rootView;
    this.udate = udate;
    this.uid = uid;
    this.uname = uname;
    this.utime = utime;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RankingItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RankingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.ranking_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RankingItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      TextView udate = rootView.findViewById(R.id.udate);
      if (udate == null) {
        missingId = "udate";
        break missingId;
      }
      TextView uid = rootView.findViewById(R.id.uid);
      if (uid == null) {
        missingId = "uid";
        break missingId;
      }
      TextView uname = rootView.findViewById(R.id.uname);
      if (uname == null) {
        missingId = "uname";
        break missingId;
      }
      TextView utime = rootView.findViewById(R.id.utime);
      if (utime == null) {
        missingId = "utime";
        break missingId;
      }
      return new RankingItemBinding((LinearLayout) rootView, udate, uid, uname, utime);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
