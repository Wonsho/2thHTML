// Action Sheet 보이기
function showActionSheet() {
	document.getElementById("actionSheet").classList.add("active");
}

// Action Sheet 감추기
    function hideActionSheet() {
    document.getElementById("actionSheet").classList.remove("active");
}

// 각 옵션 클릭 시 처리
function handleOption(option) {
    // 여기에 옵션 클릭 시 로직 작성
    alert("Selected Option: " + option);
    // Action Sheet 감추기
    hideActionSheet();
}