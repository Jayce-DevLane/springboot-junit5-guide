# Junit5 Test
### Junit 5 어노테이션

**@BeforeEach :** </br>
각 테스트 메소드가 실행되기 전 실행되어야 하는 메소드를 명시해준다. </br>
@Test, @RepeatedTest, @ParameterizedTest, @TestFactory 가 붙은 테스트 메소드가 실행하기 전에 실행된다.
Junit4의 @Before 와 같은 역할을 한다. </br> 
개인적으로 테스트하기 전에 필요한 목업 데이터를 미리 세팅해주기 위해 주로 사용한다.

**@AfterEach :** </br>
@Test, @RepeatedTest, @ParameterizedTest, @TestFactory가 붙은 테스트 메소드가 실행되고 난 후 실행된다.
Junit4의 @After 어노테이션과 같은 역할을 한다.

**@Nested:** </br>
test 클래스안에 Nested 테스트 클래스를 작성할 때 사용되며, static이 아닌 중첩 클래스, 즉 Inner 클래스여야만 한다.
테스트 인스턴스 라이플사이클이 per-class 로 설정되어 있지 않다면 @BeforeAll, @AfterAll가 동작 하지 않으니 주의하자.

**@Tag:** </br>
테스트를 필터링할 때 사용한다. 클래스 또는 메소드레벨에서 사용한다.

**@Disabled:** </br>
테스트 클래스나, 메소드의 테스트를 비활성화 한다. JUnit4의 @Ignore와 같다.

**@Timeout:** </br>
주어진 시간안에 테스트가 끝나지 않으면 실패한다.

**@ExtendWith:** </br>
extension을 등록한다. 이 어노테이션은 상속이 된다. 확장팩이라고 생각하면 될 것 같다.

**@RegisterExtension:** </br>
필드를 통해 extension을 등록한다. 이런 필드는 private이 아니라면 상속된다.

**@TempDir:** </br>
필드 주입이나 파라미터 주입을 통해 임시적인 디렉토리를 제공할 때 사용한다.
