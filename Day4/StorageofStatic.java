//Storage of Static Method and Static Variable


//When we create a static variable or method it is stored in the special area on heap: PermGen(Permanent Generation),
// where it lays down with all the data applying to classes(non-instance data).
// Starting from Java 8 the PermGen became - Metaspace.
// The difference is that Metaspace is auto-growing space, while PermGen has a fixed Max size, and this space is shared among all of the instances.
// Plus the Metaspace is a part of a Native Memory and not JVM Memory.








package Week_1.Day4;

public class StorageofStatic {
}
