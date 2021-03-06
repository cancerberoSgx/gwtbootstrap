package org.sgx.gwtbootstrap.client;

import com.google.gwt.dom.client.Element;

/**
 * API for needed JavaScript Bootstrap components
 * 
 * @see http://twitter.github.io/bootstrap/javascript.html
 * 
 * @author sg
 * 
 */
public class Bootstrap {
	public static final native void dropdown(String selector)/*-{
		$wnd.$(selector).dropdown();
	}-*/;

	public static final native void dropdown(Element e)/*-{
		$wnd.$(e).dropdown();
	}-*/;

	/* MODAL */

	public static final native void modal(Element e)/*-{
		$wnd.$(e).modal();
	}-*/;

	/**
	 * @param e
	 *            the modal element
	 * @param action
	 *            - valid values: toggle, show, hide
	 */
	public static final native void modal(Element e, String action)/*-{
		$wnd.$(e).modal(action);
	}-*/;

	/**
	 * @param e
	 *            the modal element
	 * @param action
	 *            - valid values: toggle, show, hide
	 */
	public static final native void modal(String e, String action)/*-{
		$wnd.$(e).modal(action);
	}-*/;

	/**
	 * @param e
	 *            the modal element
	 * @param action
	 *            - valid values: toggle, show, hide
	 */
	public static final native void modal(Element e, ModalOptions options)/*-{
		$wnd.$(e).modal(options);
	}-*/;

	/**
	 * @param e
	 *            the modal element
	 * @param action
	 *            - valid values: toggle, show, hide
	 */
	public static final native void modal(String e, ModalOptions options)/*-{
		$wnd.$(e).modal(options);
	}-*/;

//	public static final native void tabEnable(Element el)/*-{
//	    $wnd.$(el).click(function (e) {
//		    e.preventDefault();
//		    $wnd.$(this).tab('show');
//	    })
//	}-*/;
	public static final native void tabShow(Element el)/*-{
	     $wnd.$(el).tab('show');
	}-*/;


}
