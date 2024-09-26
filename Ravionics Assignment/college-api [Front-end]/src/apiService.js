import axios from 'axios';

const API_URL = "http://localhost:8080/api/colleges";  // URL to your backend server

// Function to get the list of all colleges
export const getColleges = async () => {
    return await axios.get(API_URL);
};

// Function to get the details of a specific college by its ID
export const getCollegeDetails = async (id) => {
    return await axios.get(`${API_URL}/${id}`);
};
