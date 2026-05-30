import React,{useState,useEffect} from 'react'
import { listDepartments } from '../services/DepartmentService';
import { useNavigate} from 'react-router-dom';

const ListDepartmentComponent = () => {

    const [departments, setDepartments] = useState([]);

    const navigator = useNavigate();

    

    useEffect(() => {
        getAllDepartment();
        }, []);


    function getAllDepartment()
    {
        listDepartments().then((response) => {
            setDepartments(response.data);
        }).catch((error) => {
            console.error(error);
        })
    }
    function addNewDepartment(){
        navigator('/add-department');
    }


  return (

    <div className='container'>

        <h2 className='text-center'>List of Departments</h2>
        <button type="button" className="btn btn-success mb-2" onClick={addNewDepartment}>Add Department</button>
        <table className='table table-striped table-bordered'>
            <thead>
                <tr>
                    <th>Department Id</th>
                    <th>Department Name</th>
                    <th>Department Description</th>
                </tr>
            </thead>
            <tbody>
                {
                    departments.map((department) => (
                    <tr key={department.id}>
                        <td>{department.id}</td>
                        <td>{department.departmentName}</td>
                        <td>{department.departmentDescription}</td>
                    </tr>))
                
                }
            </tbody>
            
        </table>
    </div>
  )
}

export default ListDepartmentComponent
