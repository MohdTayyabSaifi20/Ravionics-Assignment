import React, { useState, useEffect } from 'react';
import { getCollegeDetails } from './apiService';
import { useParams } from 'react-router-dom';  // Get URL parameters

const CollegeDetails = () => {
    const { id } = useParams();  // Extract the id from the URL
    const [college, setCollege] = useState(null);

    // Fetch the college details when the component loads or when the id changes
    useEffect(() => {
        fetchCollegeDetails();
    }, [id]);

    const fetchCollegeDetails = async () => {
        try {
            const response = await getCollegeDetails(id);
            setCollege(response.data);  // Store the fetched college details in state
        } catch (error) {
            console.error("Error fetching college details:", error);
        }
    };

    return (
        <div>
            {college ? (
                <div>
                    <h1>{college.collegeName}</h1>
                    <p>Course: {college.courseName}</p>
                    <p>Duration: {college.duration} years</p>
                    <p>Accommodation: {college.accommodationType}</p>
                    <h2>Course Fees</h2>
                    <ul>
                        {college.courseFees.map(fee => (
                            <li key={fee.id}>Fee: ${fee.feeAmount}, Accommodation Fee: ${fee.accommodationFee}</li>
                        ))}
                    </ul>
                </div>
            ) : (
                <p>Loading...</p>
            )}
        </div>
    );
};

export default CollegeDetails;
