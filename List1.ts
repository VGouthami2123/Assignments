class ListNode<T> 
{
  public data: T | undefined;
  public next: ListNode<T> | null;
  
  constructor(data: T)
 {
    this.data = data;
    this.next = null;
  }
}

class List<T> 
{
  private head: ListNode<T> | null;
  private tail: ListNode<T> | null;
  private count: number;
  constructor() 
  {
    this.head = null;
    this.tail = null;
    this.count = 0;
  }
  public addAtTheBeg(element: T): void {
    const newNode = new ListNode<T>(element);
    if (this.head === null) 
    {
      this.head = newNode;
      this.tail = newNode;
    } else
    {
      newNode.next = this.head;
      this.head = newNode;
    }
    this.count++;
    }
 public append(element: T): void 
   {
    const newNode = new ListNode<T>(element);
    if (this.head === null)
    {
      this.head = newNode;
      this.tail = newNode;
    } 
    else 
    {
      this.tail!.next = newNode;
      this.tail = newNode;
    }
    this.count++;
    }
 public insertAtPosition(position: number, element: T): void
    {
    if (position < 0 || position > this.count)
    {
      throw new Error("Invalid position.");
    }
    if (position === 0)
    {
      this.addAtTheBeg(element);
    } else if (position === this.count)
    {
      this.append(element);
    }
    else
    {
      const newNode = new ListNode<T>(element);
      let current = this.head;
      for (let i = 0; i < position - 1; i++) 
      {
        current = current!.next;
      }
      newNode.next = current!.next;
      current!.next = newNode;
      this.count++;
    }
  }
 public deleteFromEnd(): void
 {
    if (this.count === 0) {
      throw new Error("The list is empty.");
    } else if (this.count === 1) {
      this.head = null;
      this.tail = null;
    } else {
      let current = this.head;

 

      while (current!.next !== this.tail) {
        current = current!.next;
      }

 

      current!.next = null;
      this.tail = current;

 

      this.count--;
    }
  }

 

  public deleteFirst(): void {
    if (this.count === 0) {
      throw new Error("The list is empty.");
    } else if (this.count === 1) {
      this.head = null;
      this.tail = null;
    } else {
      this.head = this.head!.next;
    }

 

    this.count--;
  }

 

  public delete(element: T): void {
    if (this.count === 0) {
      throw new Error("The list is empty.");
    }

 

    if (this.head?.data === element) {
      this.deleteFirst();
    } else {
      let current = this.head;
      let previous = null;

 

      while (current?.next !== null && current.next.data !== element) {
        previous = current;
        current = current.next;
      }

 

      if (current?.next !== null) {
        previous!.next = current.next;

 

        if (current.next === null) {
          this.tail = previous;
        }

 

        this.count--;
      } else {
        throw new Error("Element does not exist.");
      }
    }
  }

 

  public displayList(): void {
    let current = this.head;
    let output = "";

 

    while (current !== null) {
      output += current.data + " -> ";
      current = current.next;
    }

 

    output += "null";
    console.log(output);
  }
}

const list = new List<number>();
list.addAtTheBeg(8);
list.append(6);
list.insertAtPosition(1, 2);
list.displayList(); 

 

list.delete(8);
list.displayList(); 