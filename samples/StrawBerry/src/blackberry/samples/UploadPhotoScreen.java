/**
 * Copyright (c) E.Y. Baskoro, Research In Motion Limited.
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without 
 * restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following 
 * conditions:
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, 
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES 
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND 
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR 
 * OTHER DEALINGS IN THE SOFTWARE.
 * 
 * This License shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * The name(s) of the above copyright holders shall not be used 
 * in advertising or otherwise to promote the sale, use or other 
 * dealings in this Software without prior written authorization.
 * 
 */
package blackberry.samples;

import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.component.LabelField;
import blackberry.ui.AbstractScreen;
import blackberry.util.Logger;
import blackberry.util.LoggerFactory;

/**
 * UploadPhotoScreen
 * 
 * @author Eki Baskoro
 * @version 0.1
 * 
 */
final class UploadPhotoScreen extends AbstractScreen {

	// Logger
	private static final Logger log = LoggerFactory.getLogger(UploadPhotoScreen.class.getName());

	// List of actions:
	static final String ACTION_ENTER = "uploadPhoto";
	static final String ACTION_SUCCESS = "photoUploaded";
	static final String ACTION_ERROR = "error";

	// List of labels:
	private static final String LABEL_TITLE = "Upload Photo";

	/**
	 * Default constructor.
	 * 
	 */
	UploadPhotoScreen() {
		setTitle(new LabelField(LABEL_TITLE, LabelField.ELLIPSIS | LabelField.USE_ALL_WIDTH));
		Dialog.alert("Not implemented yet.");
		log.debug("Inside Upload Photo");
	}

}
