/**
 * function.is
 * 07_ function.html
 */

console.log('hello');

/**
 * JavaScript 에서 함수를 선언(정의)하는 방법:
 * function 함수이름([파라미터,...]){
 *      실행코드 ;
 *      [return [리턴값];]
 * }
 * 
 * 
 * - 함수의 리턴 타입을 선언하지 않음.
 * - 파라미터르 선언할 때 var, const, let 키워드를 사용하지 않음.
 */

 function add(x, y) {
     return x + y;
 }
 // 함수 호출 :
 let result = add(1, 2);
 console.log("result = ", result);
 
 // argument : 함수를 호출할 때 함수에 전달하는 값.
 // parameter : 전달받은 argument를 저장하기 위한 지역 변수. 함수 선언부에서 선언.

 // 자바스크립트 함수는 파라미터의 타입을 검사하지 않음.
 result = add('안녕하세요', 'Hello');
 console.log(result);
 
 // 자바스크립트 함수는 파라미터 개수를 검사하지 않음.
 result = add(10, 20, 30); // 함수 선언의 parameter개수보다 더 많은 argument를 전달.
 console.log('result =', result);
 
 result = add(1); // 함수 선언의 parmeter 개수보다 적은 argument를 전달.
 // 전달하지 않은 파라미터의 값은 undefined가 됨.
 console.log('result =', result); // -> NaN(Not a Number)
 
 // 자바스크립트의 모든 함수는 arguments 이름의 프로피터를 가지고 있음
 // 함수 호출에서 전달한 모든 값들을 저장하는 (배열과 비슷한)객체.
 
 function test(){
     console.log(arguments);
     for(let x of arguments) {
        console.log(x); 
     }
     
 }
 
 test(1);
 test(1, 'hello');
 
 
 /*
 JavaScript 함수의 특징 : 함수는 객체.(object)!
 1. 함수는 프로퍼티(property -  자바의 필드)를 가질 수 있음.
 2. 함수는 변수에 저장할 수 있음.
 3. 함수의 argument로 다른 함수를 전달할 수 있음.
 4. 함수 내부에서 다른 함수를 선언(정의)할 수 있음.
 5. 함수는 다른 함수를 리턴할 수 있음.
 */

 const plus = add; // 함수는 변수에 저장.
 result = plus (100, 200);
 console.log('result = ' + result);
 
 // 익명함수 : 이름이 없는 함수.
 const minus = function(x, y){
     return x - y;
 };
 console.log('minus = ' + minus(1, 2));
 
 // 익명 함수를 선언과 동시에 호출 :
 result = (function (x, y){
    return x / y; 
 })(1, 2);
 console.log('result = ' +result);
 
 // 함수를 argument로 갖는 함수 : 
 function calculate(x, y, operator) {
     return operator(x, y);
 }
 
 result = calculate(1, 2, add);
 console.log('result = ' + result);
 
 
 result = calculate(1, 2, function (x, y){
     return x - y;
     
 });
 
 console.log('result = ' +result);
 
 
 