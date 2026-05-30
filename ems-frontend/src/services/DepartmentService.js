import axios from 'axios';

const REST_API_BASE_URL = 'http://localhost:8080/api/departments';

export const listDepartments = () => axios.get(REST_API_BASE_URL);

export const getDepartment = departmentId => axios.get(`${REST_API_BASE_URL}/${departmentId}`);

export const createDepartment = department => axios.post(REST_API_BASE_URL, department);

export const updateDepartment = (id, department) => {
  return axios.put(`${REST_API_BASE_URL}/${id}`, department);
};

export const deleteDepartment = (id) => {
  return axios.delete(`${REST_API_BASE_URL}/${id}`);
};