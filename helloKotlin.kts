import java.util.*
import kotlin.collections.HashMap
val list:IntArray = intArrayOf(5,12,1,36,173,2,1,54,1,1,1,1)
var a:Int=0
val myMap: java.util.HashMap<Int ,Int> = HashMap()
while (a<list.size){
    if (myMap.containsKey(list[a])){
		myMap[list[a]]=myMap[list[a]]!!+1
    }
    else {
        myMap.put(list[a], 1)
    }
    a+=1
}
for ((i,e) in myMap) {
    println("$i is repeated $e times")
}
