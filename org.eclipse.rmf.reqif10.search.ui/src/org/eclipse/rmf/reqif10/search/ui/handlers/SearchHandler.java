package org.eclipse.rmf.reqif10.search.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.rmf.reqif10.search.ui.dialogs.ReqIFSearchDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class SearchHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ReqIFSearchDialog reqIFSearchDialog = new ReqIFSearchDialog(
				HandlerUtil.getActiveShell(event));
		reqIFSearchDialog.open();
		return null;
	}

}
