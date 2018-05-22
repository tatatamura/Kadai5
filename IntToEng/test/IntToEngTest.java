import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void oneと表示するためのテスト() {
		IntToEng itg = new IntToEng();
		int i = 1;
		String s = "one";
		String actual = itg.translateEng(i);
		assertThat(actual,is(s));
	}
	
	@Test
	public void twentyoneを表示するためのテスト() {
		IntToEng itg = new IntToEng();
		int i = 21;
		String s = "twenty-one";
		String actual = itg.translateEng(i);
		assertThat(actual,is(s));
	}

}
