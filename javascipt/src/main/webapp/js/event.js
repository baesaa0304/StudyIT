/**
 * 
 */
document.addEventListener("DOMContentLoaded" , function(){
    const itemInput = document.querySelector("input#itemInput");
    const btnInput = document.querySelector("button#btnInput");
    const itemList = document.querySelector("ul#itemlist");
    const itemInputes = document.querySelector('input#itemInputes');
    const lists = document.querySelector("ul#list");  
    const uername = document.querySelector('input#username');
    const age = document.querySelector('input#age'); 
    const result = document.querySelector('div#result');
  
    
    btnInput.addEventListener("click" , function (){
        // input에 입력된 값을 읽는다.
        const value = itemInput.value;  
        // console.log(value);  
        
        // input에 입력된 값으로 li 요소를 만듦.
        const item = `<li>${value}</li>`;
        
        // li 요소를 ul에 추가.
        itemList.innerHTML += item;
        
        // li를 추가한 다음에는 input 값을 지움.
        itemInput.value = '';
        
         // input에 포커스를 줌.
        itemInput.focus();
 
    }); 
    
    itemInputes.addEventListener("keydown", function(e) {
        console.log(e);  // -> e: keyboardEvent 객체
        // 모든 이벤트 핸들러 함수(콜백)은 이벤트 객체를 argument로 전달받음.
    
       if (e.key === "Enter") { // 엔터키가 눌렸을 때
       const items = `<li>${itemInputes.value}</li>`;
       lists.innerHTML += items
       itemInputes.value = "";
       itemInputes.focus();
    }
     
   });
   uername.addEventListener('change', function(e){
      updateNameAndAge();
   });
   
   age.addEventListener('change', function(e){
      updateNameAndAge();
   });
    
    
    function updateNameAndAge(){
        const name = uername.value;
        const age2 = age.value;
        const text = `<b>이름:</b> ${name}, <b>나이:</b> ${age2}`; 
        result.innerHTML = text;    
       }
   
   
      
 }); 
    
    
    
     
   
    
