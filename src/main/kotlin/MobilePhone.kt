class MobilePhone(var myNumber: String, var myContacts: MutableList<Contact> = mutableListOf()) {

    fun addNewContact(contact: Contact): Boolean {
        if (findContact(contact) == -1) {
            myContacts.add(contact)
            return true
        }
        return false
    }

    fun removeContact(contact: Contact): Boolean {
        var indexContact = findContact(contact)
        if(indexContact != -1) {
            myContacts.removeAt(indexContact)
            return true
        }
        return false
    }

    fun printContacts() = myContacts.forEach(::println)

    private fun findContact(contact: Contact): Int = myContacts.indexOfFirst { cont -> (cont.name.equals(contact.name) &&
            cont.phoneNumber.equals(contact.phoneNumber))}

    fun queryContact(name: String): Contact? =  myContacts.singleOrNull { contact -> contact.name.equals(name) }

}