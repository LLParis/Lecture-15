
class Lecture15 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 15");

        // NOTE NOTE NOTE
        // Several problems ask you to draw pictures / images. Here are some ideas for
        // how to do that:
        //
        // Some ideas for how to draw the images:
        // * Draw this out on paper, snap a picture with your phone
        //
        // * Capture a screenshot and then draw on it using MS Paint or MacOS Image
        // Preview, etc
        // (You'll need to Google for how to take the screenshot - it's not hard once
        // you know how, it's just well-hidden)
        //
        // * Use diagram-making software. You can find free online websites that let you
        // do this on the website
        //
        // * If you find other ways please do share! Especially if they're quick and
        // easy! :)

        //
        //
        // Some ideas for how to add the images to this repo:
        //
        // * Add the image files directly to the repo (in which case please name the
        // files
        // Question 5.png, or Answer 6.gif, or 7.jpeg, or whatever)
        //
        // * Embedding them in a Word /.DOC/.DOCX file
        //
        // * Embed them into a .PDF file (this is good for MacOS people - you can create
        // a .pages file, then export to .PDF)
        // (I can't open .pages files reliably on Windows)

        //
        // DO NOT DO THE FOLLOWING:
        //
        // * Do NOT upload to Google Drive / Dropbox / etc and then hand in a link.
        // I want to have copies of the work that you've done even after the quarter
        // ends

        //
        //
        //
        // Self-Check Problems:
        // Section 16.1: Working with Nodes

        // 1. What is the difference between a linked list and an array list? How are
        // they similar?
        // An ArrayList has random access meaning you can choose which element you want to access with O(1) time complexity.
        // A LinkedList has sequential ordering which means you must traverse the list to reach the element with O(n) time complexity.
        // Both data structures can grow dynamically in size, adding or removing elements.

        // 2. What is the difference between a linked node and a linked list? How are
        // they related and connected?
        // A linked node is a single unit in a linked list that contains data and a reference to the next node.
        // A linked list is a collection of linked nodes in sequence, pointing to the next node, forming a chain.
        // They are related and connected because linked nodes form to build a linked list.
        // You must start at the head node and traverse through body nodes to reach the element you want to access.

        // 3. What value is stored as the next field of the last node of a list? What
        // value will a node’s next field have if none is specified?
        // The value typically stored as the next field of the last node in a list is null.
        // The value a node's next field will have, if none is specified, is null.

        // 4. What happens if you or the client try to go past the last element in a
        // linked list? Be specific.
        // If we use a loop to traverse past the last element, we will receive a NullPointerException.
        // If we attempt to access an index beyond the last element, we will raise a IndexOutOfBoundsException!

        // QUESTIONS 5- 17:
        // Please put these into a separate file(s), as described in this file above

        // Section 16.2: A Linked List Class
        // 18. What are the two ways to change the contents of a linked list?
        // We can modify the data within the nodes, or we can modify the actual structure of the list.

        // 19. An element can be inserted at or removed from the beginning, middle, or
        // end of a linked list.
        // Which of the three locations is the most computationally expensive, and why?
        // How does this compare against the result for an array list?
        // The most computationally expensive location to insert or remove an element from a linked list is
        // The end because you have to traverse the entire list. O(n)
        // The most computationally expensive location to insert or remove from an array list is the beginning
        // because the rest of the elements have to shift. O(n)

        // 20. When you add or remove the element found at index i of a list, you must
        // create a temporary current node reference and advance it through the list.
        // At which index’s node should the loop stop, relative to i?
        // When adding an element, you need to stop one before or index i - 1.
        // When removing an element, you need to stop one before or index i - 1.

        // 21. In an array list, it is possible to overrun the capacity of the array, at
        // which point the list must be resized to fit.
        // Is resizing necessary on a linked list? What limits the number of elements
        // that a linked list can have?
        // No, resizing is not necessary on a linked list. Each node is created then linked via pointer.
        // The limitation for a linked lists number of elements is, the memory available.
        // Each node requires memory for its data and pointer.

        // QUESTIONS 21-24:
        // Please put these into a separate file(s), as described in this file above
        //

        // Exercises:
        // None

    }
}
