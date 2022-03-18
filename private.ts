class Person{
firstName : string;
lastName: string;
    private firstName : string;
private lastName: string;

// constructor(){
//     this.firstName = '';
@@ -13,13 +13,33 @@ constructor(firstName: string ,lastName: string){
getFullName(){
    return this.lastName + this.firstName;
}

greet(){
    console.log("saying good morning");
}
};
var objectPerson = new Person("captain","america");
// objectPerson.firstName = "hulk";
console.log(objectPerson.firstName);
console.log(objectPerson.lastName);
var fullName = objectPerson.getFullName();
console.log(fullName);

// var objectPerson = new Person("captain","america");
// // objectPerson.firstName = "hulk";
// console.log(objectPerson.firstName);
// console.log(objectPerson.lastName);
// var fullName = objectPerson.getFullName();
// console.log(fullName);

class Programmer extends Person{
    greet(){
        console.log("saying good afternoon"); //overriding +dominant(1st priority)
    }
    greetLikeNormalPeople(){
        // this.greet();//afternoon
        super.greet(); // morning -> parent

    }

}

var objectProgrammer = new Programmer("captain","america");
objectProgrammer.greetLikeNormalPeople();
objectProgrammer
// objectProgrammer.
var checkType ;
checkType = new Programmer("cheese","pizza");
 