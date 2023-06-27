/**
 * 
 */
document.addEventListener('DOMContentLoaded', () => {
    
    const modifyForm = document.querySelector('#postModifyForm')
    
    const id = document.querySelector('input#id').value;
    // 업데이트
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
            modifyForm.action = './update?id=' + id;
            modifyForm.method = 'post';
            modifyForm.submit();
        }
    });
    
    // 삭제
    const btnDelete = document.querySelector('#btnDelete');
    btnDelete.addEventListener('click', (e) => {
        const check = confirm('삭제할까요?');
        if (check) {
            modifyForm.action = './delete?id='+ id; 
            modifyForm.method = 'post'; 
            modifyForm.submit(); 
        }
    });
    
    
    
});