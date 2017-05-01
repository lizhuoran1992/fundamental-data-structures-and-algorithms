var array = [1, 2, 3, 4, 6, 10]; // Your sorted array
var key = 2; // Your target key to find

function searchKey(key, array, lowIdx, uppIdx) {
    var mid = Math.floor((lowIdx + uppIdx) / 2);
    if(key === array[mid]) {
        return mid;
    }
    if(lowIdx + 1 === uppIdx) {
        return -1;
    }
    if(key < array[mid]) {
        return searchKey(key, array, lowIdx, mid);
    } else {
        return searchKey(key, array, mid, uppIdx);
    }
}

searchKey(key, array, -1, array.length);
