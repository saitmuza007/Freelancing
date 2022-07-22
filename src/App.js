import logo from './logo.svg';
import './App.css';
import Navbar from './components/Navbar';
import HomePage from './components/HomePage';
import Need from './components/Need';
import About from './components/About';
import Faq from './components/Faq';
function App() {
  return (
    <div className="App">
      <Navbar></Navbar>
      <HomePage></HomePage>
      <Need></Need>
      <About></About>
      <Faq></Faq>
      
     
    </div>
  );
}

export default App;
