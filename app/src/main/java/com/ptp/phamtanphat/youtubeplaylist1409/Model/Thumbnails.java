package com.ptp.phamtanphat.youtubeplaylist1409.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnails {

@SerializedName("default")
@Expose
private Default _default;

private Maxres maxres;

public Default getDefault() {
return _default;
}

public void setDefault(Default _default) {
this._default = _default;
}

public Maxres getMaxres() {
return maxres;
}

public void setMaxres(Maxres maxres) {
this.maxres = maxres;
}

}