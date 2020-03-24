package di;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public class ContainerService {
	public static <T> T getObject(Class<T> classType) {
		// 기본생성자를 통해서 인스턴스를 만든다.
		// 여기서 instance는 ArticleController 클래스 객체
		T instance = createInstance(classType);
		
		// 클래스의 모든 필드를 불러온다.
		Stream.of(classType.getDeclaredFields())
			.filter(field -> field.isAnnotationPresent(AutoWired.class)) // 어노테이션에 AutoWired를 갖는 필드만 필터
			.forEach(field -> {
				// 필드의 인스턴스를 생성 ArticleService타입 (한번만 돈다)
				Object fieldInstance= createInstance(field.getType());
				// 필드의 접근제어가 private인 경우 수정가능하게 설정
				field.setAccessible(true);
				try {
					// field == private ArticleService articleService필드
					// instance = ArticleController 객체
					// fieldInstance = ArticleService 객체
					field.set(instance, fieldInstance);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}
				
			});
		return instance; // ArticleController 리턴!!
	}
	
	private static <T> T createInstance(final Class<T> classType) {
		try {
			return classType.getConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		}
	}
}
