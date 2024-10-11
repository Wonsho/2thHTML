function addBtn() {
  
  // 토글 할 버튼 선택 (btn1)
  const btn1 = document.getElementById('btn1');
  
  // btn1 숨기기 (visibility: hidden)
  if(btn1.style.visibility !== 'hidden') {
    btn1.style.visibility = 'hidden';
  }
  // btn` 보이기 (visibility: visible)
  else {
    btn1.style.visibility = 'visible';
  }
  
}