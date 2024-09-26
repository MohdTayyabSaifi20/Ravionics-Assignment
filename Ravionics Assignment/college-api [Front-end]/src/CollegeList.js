import React, { useState, useEffect } from 'react';
import { getColleges } from './apiService';
import { Link } from 'react-router-dom';  // For navigation

const CollegeList = () => {
    const [colleges, setColleges] = useState([]);

    // Fetch the list of colleges when the component loads
    useEffect(() => {
        fetchColleges();
    }, []);

    const fetchColleges = async () => {
        try {
            const response = await getColleges();
            setColleges(response.data);  // Store the fetched colleges in state
        } catch (error) {
            console.error("Error fetching colleges:", error);
        }
    };

    return (
        <div>
            <h1>List of Colleges</h1>
            <ul>
                {colleges.map((college) => (
                    <li key={college.id}>
                        {/* Link to college details page */}
                        <Link to={`/colleges/${college.id}`}>
                            {college.collegeName} - {college.courseName}
                        </Link>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default CollegeList;
