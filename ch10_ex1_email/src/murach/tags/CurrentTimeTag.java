package murach.tags;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.util.*;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CurrentTimeTag extends TagSupport {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
	 */
	@Override
	public int doStartTag() throws JspException {
		Date currentTime = new Date();
		DateFormat longDate = DateFormat.getTimeInstance(DateFormat.LONG);
		String currentTimeFormatted = longDate.format(currentTime);

		try {
			JspWriter out = pageContext.getOut();
			out.print(currentTimeFormatted);
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
		return SKIP_BODY;
	}

}
