//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun main() {
    students()
println(students())
    var sau= peoples(listOf(8,95,3,67))
    println(sau)
    createCar()


}
fun students():List<String>{
   val names = listOf("Joy", "John","Step","Shon","James","Job","Dan","Shon","Jojoh","Mary")
    val evenStudents = names.filterIndexed { index,name ->index%2==0 }
    return evenStudents

}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun  peoples(people:List<Int>):String{
    val sum= people.sum()
    val p = people.average()
    val r ="$sum $p"
    return r


}


//Given a list of Person objects, each with the attributes, name, age,.
//height and weight. Sort the list in order of descending age

data class personweight(var name:String,var age:Int,var height:Double,var weight:Double)

fun heights(){
    val  person1 = personweight("joy",34,4.9,2.0)
    val person2 = personweight("james",64,6.0,43.8)
    val person3 = personweight("mary",32,8.9,23.00)
    val person4 = personweight("sam",54,7.3,65.8)
    val person5 = personweight("jojo",98,3.2,8.00)
    val personList= mutableListOf(person1,person2,person3,person3,person4,person5)
    val sorted= personList.sortByDescending { personweight ->personweight.age  }
    return sorted
}



//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.




//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class vehicles (val regestration:String,val mailage:Double)
    fun createCar() {
        val car1 = vehicles("KBL 7684 ", 8.0)
        val car2 = vehicles("KBJ 5438", 61.0)
        val car3 = vehicles("KJB 6458", 5.0)
        var car4 = vehicles("KBB 5463", 8.10)
        var car5 = vehicles("KJJ 6745", 7.0)
var car6=listOf(car1,car2,car3,car4,car5)
        println(car6)
    }


