# BlogApp

A simple React application that demonstrates **React component lifecycle methods** (`componentDidMount` and `componentDidCatch`) by fetching and displaying blog posts from a public API.

---

## **Objectives**
- Explain the need and benefits of component lifecycle.
- Identify various lifecycle hook methods.
- List the sequence of steps in rendering a component.
- Implement `componentDidMount()` to fetch data.
- Implement `componentDidCatch()` for error handling.

---

## **Prerequisites**
- Node.js (>= 14)
- NPM
- Visual Studio Code (or any code editor)

---

## **Features**
- Fetches a list of posts from `https://jsonplaceholder.typicode.com/posts`.
- Renders posts dynamically using a `Post` component.
- Handles errors with the `componentDidCatch()` lifecycle method.

---
## **Setup & Installation**
1. Clone or create the project:
   ```bash
   npx create-react-app blogapp
   cd blogapp