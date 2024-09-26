import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import CollegeList from './CollegeList';
import CollegeDetails from './CollegeDetails';

function App() {
  return (
    <Router>
      <Routes>
        {/* Route to display the list of colleges */}
        <Route path="/" element={<CollegeList />} />
        
        {/* Route to display the details of a specific college */}
        <Route path="/colleges/:id" element={<CollegeDetails />} />
      </Routes>
    </Router>
  );
}

export default App;
