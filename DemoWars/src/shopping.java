import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.Desktop;

public class shopping {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'www.advantageonlineshopping.com'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void speakershopping() {
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.speakersImg").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.20").click();
		desktop.<DomButton>find("advantageonlineshopping_com.BrowserWindow.save_to_cart").click();
		desktop.<DomElement>find("advantageonlineshopping_com.BrowserWindow.menuCart").click();
		desktop.<DomLink>find("advantageonlineshopping_com.BrowserWindow.REMOVE").click();
		desktop.<DomLink>find("advantageonlineshopping_com.BrowserWindow.CONTINUE SHOPPING").click();
	}

}