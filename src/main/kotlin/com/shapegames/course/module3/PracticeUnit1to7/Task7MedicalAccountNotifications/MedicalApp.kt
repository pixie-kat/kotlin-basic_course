package com.shapegames.course.module3.PracticeUnit1to7.Task7MedicalAccountNotifications

//Create objects of each type and call their alert() function to see the different messages.
fun main() {
    val medicalAccountInfo = MedicalAccount("Kathrin")
    medicalAccountInfo.alert()
    val doctorAccountInfo = DoctorAccount("Kathrin")
    doctorAccountInfo.alert()
    val patientAccountInfo = PatientAccount("Kathrin")
    patientAccountInfo.alert()
}
//Unit 7: Overriding Practice Task
//Task 1: Medical Account Notifications
//
//Suppose you are working on a medical app.
//
//Create a base class MedicalAccount with a property username (String) and a function alert() that prints "General medical notification for {username}".
open class MedicalAccount(val username: String){
    open fun alert(){
        println("General medical notification for ${username}")
    }
}
//Create a class DoctorAccount that inherits from MedicalAccount and overrides the alert() function to print "Doctor alert for {username}".
class DoctorAccount(username: String) : MedicalAccount(username){
    override fun alert() {
        println("Doctor alert for ${username}")
    }
}
//Create a class PatientAccount that also inherits from MedicalAccount and overrides the alert() function to print "Patient reminder for {username}".
class PatientAccount(username: String): MedicalAccount(username){
    override fun alert() {
        println("Patient reminder for ${username}")
    }
}