package di;

public class ArticleController {
	
	@AutoWired
	private ArticleService articleService;
	
	public void foo() {
		articleService.foo();
	}
}
