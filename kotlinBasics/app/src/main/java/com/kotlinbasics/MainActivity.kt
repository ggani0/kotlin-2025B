package com.kotlinbasics

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
//        week02Variables()
//        week02Functions()
//        week03Classes()
        week03Collections()


    }
}

private fun week03Collections(){
    Log.d("KotlinWeek03","== Kotlin Collections ==")

    val fruits = listOf("apple","banana","orange")
    //fruits.add("kiwi") - error
    Log.d("KotlinWeek03","Fruits : $fruits")

    for(fruit in fruits){
        Log.d("KotlinWeek03","Fruit : $fruit")
    }


}

private fun week03Classes() {
    println("== Kotlin Classes ==")

    class Student{
        var name: String =""
        var age: Int = 0

        fun introduce() {
            println("Hi, I'm $name and I'm $age years old")
        }
    }
    val student = Student()
    student.name = "Kim"
    student.age =21
    student.introduce()

    data class Person(val name: String, val age:Int)

    val person1 = Person("Lee", 22)
    val person2 = Person("cho",19)

    println("Person1: $person1")
    println("Equal?: ${person1 == person2}")
}
private fun week02Functions() {
    println("Week02 Functions")

  //  fun greet(name: String) = "Hello, $name!"

  //  println(greet("Android Developer"))

    println("== Kotlin Functions ==")

    fun greet(name: String): String{
        return "Hello, $name"
    }

    fun add(a: Int, b: Int) = a + b

    fun introduce(name: String, age: Int = 19){
        println("My name is $name and I'm $age years old")
    }

    println(greet("Kotlin"))
    println("Sum : ${add(5, -71)}")
    introduce("Park")
    introduce("Kim", 29)
}

private fun week02Variables() {
    println("Week02 variables")

    val courseName = "mobile programing"
    //courseName = "IOT Programing"
    var week = 1
    week = 2

    //println("Course : $courseName")
    //println("Week : $week")

    println("== Kotlin Variables ==")

    val name = "Android"
    var version = 8.1
    println("Hello $name $version")

    val age: Int = 21
    val height : Double = 160.5
    val isStudent: Boolean = false

    print("Age : $age, Height : $height, Student : $isStudent")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}