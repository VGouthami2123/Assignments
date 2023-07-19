var ListNode = /** @class */ (function () {
    function ListNode(data) {
        this.data = data;
        this.next = null;
    }
    return ListNode;
}());
var List = /** @class */ (function () {
    function List() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }
    List.prototype.addAtTheBeg = function (element) {
        var newNode = new ListNode(element);
        if (this.head === null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.count++;
    };
    List.prototype.append = function (element) {
        var newNode = new ListNode(element);
        if (this.head === null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.count++;
    };
    List.prototype.insertAtPosition = function (position, element) {
        if (position < 0 || position > this.count) {
            throw new Error("Invalid position.");
        }
        if (position === 0) {
            this.addAtTheBeg(element);
        }
        else if (position === this.count) {
            this.append(element);
        }
        else {
            var newNode = new ListNode(element);
            var current = this.head;
            for (var i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            this.count++;
        }
    };
    List.prototype.deleteFromEnd = function () {
        if (this.count === 0) {
            throw new Error("The list is empty.");
        }
        else if (this.count === 1) {
            this.head = null;
            this.tail = null;
        }
        else {
            var current = this.head;
            while (current.next !== this.tail) {
                current = current.next;
            }
            current.next = null;
            this.tail = current;
            this.count--;
        }
    };
    List.prototype.deleteFirst = function () {
        if (this.count === 0) {
            throw new Error("The list is empty.");
        }
        else if (this.count === 1) {
            this.head = null;
            this.tail = null;
        }
        else {
            this.head = this.head.next;
        }
        this.count--;
    };
    List.prototype.delete = function (element) {
        var _a;
        if (this.count === 0) {
            throw new Error("The list is empty.");
        }
        if (((_a = this.head) === null || _a === void 0 ? void 0 : _a.data) === element) {
            this.deleteFirst();
        }
        else {
            var current = this.head;
            var previous = null;
            while ((current === null || current === void 0 ? void 0 : current.next) !== null && current.next.data !== element) {
                previous = current;
                current = current.next;
            }
            if ((current === null || current === void 0 ? void 0 : current.next) !== null) {
                previous.next = current.next;
                if (current.next === null) {
                    this.tail = previous;
                }
                this.count--;
            }
            else {
                throw new Error("Element does not exist.");
            }
        }
    };
    List.prototype.displayList = function () {
        var current = this.head;
        var output = "";
        while (current !== null) {
            output += current.data + " -> ";
            current = current.next;
        }
        output += "null";
        console.log(output);
    };
    return List;
}());
var list = new List();
list.addAtTheBeg(8);
list.append(6);
list.insertAtPosition(1, 2);
list.displayList();
list.delete(8);
list.displayList();
