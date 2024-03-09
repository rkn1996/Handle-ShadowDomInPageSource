# SHADOW-DOM TOPIC IN SELENIUM:-

To develop web pages, Dev team is using combination of many technologies along with HTML. "Web component" topic of web designing allows dev team to develop a DOM tree(Heirarchy of elements) in web page to isolate their styling and functionality from the rest of the page. The DOM tree developed in web components is called as "Shadow DOM".

How to handle:
If a target element in Shadow DOM in page, we have to :
1. locate shadow host element
2. locate shadow root of tree
3. locate and operate that target element

If a target element in nested shadow DOM in page, we have to locate shadow host and then locate shadow root of tree so no until reach target element, and then locate and operate that target element.
