//1.자바스크립트는 자료형이 동적으로 정해진다.

var num = 10;   //정수 //4Byte -> Heap
console.log("num",num);

var str = "문자열"; //문자열 //4Byte -> Heap
console.log("str",str);

var floatNum = 10.5;    //실수 //4Byte -> Heap 
console.log("floatNum",floatNum);

var charStr = "가"  //문자 //4Byte -> Heap
console.log("charStr",charStr);

var booldata = true;    //bool(참거짓) true,false //4Byte -> Heap
console.log("booldata",booldata);

var list=[1,2,3,4,5,6]; //배열 4Byte -> Heap
console.log("list",list);
console.log("list[0]",list[0]);
console.log("list[5]",list[5]);

//자바스크립트 오브젝트 (key : value) 4Byte -> Heap
var user = { 
    naver:"홍길동",
    phone : "0102222"
}
console.log("user",user);
console.log("user.name",user.name);
console.log("user.phone",user.phone);

var hello = function() {
    alert("함수 호출됨");
}

hello();