/**
 * 
 */
document.addEventListener('DOMContentLoaded', () => {
    
    const modifyForm = document.querySelector('#postModifyForm')
    
    // name 값을 안 줄때 ID 값을 찾아줘야함 그래야 JS에서 찾음
    // const id = document.querySelector('input#id').value;
    
    
    // 수정 업데이트
    const btnUpdate = document.querySelector('#btnUpdate')
    btnUpdate.addEventListener('click', (e) => {
        alert('업데이트')
        const title= document.querySelector('input#title').value;
        const content = document.querySelector('textarea#content').value;
        if (title === '' || content === '') {
            alert('제목과 내용은 반드시 입력하세요.');
            return; // 함수 종료
        }
        
        const check = confirm('변경 내용을 저장?');
        if(check) {
            
             // HTML에서 name 값을 주지 않으면 modifyForm.action = './update?id='+ id
            // name 값을 주면 굳이 경로를 제대로 안 써도 됨
            modifyForm.action = '/post/update'
           
            modifyForm.method = 'post';  // submit 요청 방식  get방식 or post 방식
            
            // 버튼이 HTML에서 form 안에 있으면 submit이 필요없음
            //  그러나 버튼이 form 밖에 있으면 써줘야 함.
            modifyForm.submit(); // 폼 제출(submit) 요청 보내기
        }
    });
    
    // 삭제
    const btnDelete = document.querySelector('#btnDelete');
    btnDelete.addEventListener('click', (e) => {
        const result = confirm('삭제할까요?');
        if (!result) {
            return;           
        }   
             // HTML에서 name 값을 주지 않으면 modifyForm.action = './delete?id='+ id
            // name 값을 주면 굳이 경로를 제대로 안 써도 됨
            
            modifyForm.action = '/post/delete' // 요청 주소
           
            modifyForm.method = 'post';  // submit 요청 방식  get방식 or post 방식
            
            // 버튼이 HTML에서 form 안에 있으면 submit이 필요없음
            //  그러나 버튼이 form 밖에 있으면 써줘야 함.
            modifyForm.submit(); // 폼 제출(submit) 요청 보내기
    });
    
    
    
});