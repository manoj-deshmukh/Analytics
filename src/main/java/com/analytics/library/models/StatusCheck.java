package com.analytics.library.models;

public class StatusCheck {
	private String event;
	private String target;
	private String x_co_ordinate;
	private String y_co_ordinate;
	private String scrolltop;
	private String timestamp;
	private String keycode;
	private String hover_data;

	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getX_co_ordinate() {
		return x_co_ordinate;
	}
	public void setX_co_ordinate(String x_co_ordinate) {
		this.x_co_ordinate = x_co_ordinate;
	}
	public String getY_co_ordinate() {
		return y_co_ordinate;
	}
	public void setY_co_ordinate(String y_co_ordinate) {
		this.y_co_ordinate = y_co_ordinate;
	}
	public String getScrolltop() {
		return scrolltop;
	}
	public void setScrolltop(String scrolltop) {
		this.scrolltop = scrolltop;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getKeycode() {
		return keycode;
	}
	public void setKeycode(String keycode) {
		this.keycode = keycode;
	}
	public String getHover_data() {
		return hover_data;
	}
	public void setHover_data(String hover_data) {
		this.hover_data = hover_data;
	}
	@Override
	public String toString() {
		return "StatusCheck [event=" + event + ", target=" + target + ", x_co_ordinate=" + x_co_ordinate
				+ ", y_co_ordinate=" + y_co_ordinate + ", scrolltop=" + scrolltop + ", timestamp=" + timestamp
				+ ", keycode=" + keycode + ", hover_data=" + hover_data + "]";
	}
	

}
