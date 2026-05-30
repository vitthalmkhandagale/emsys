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

     function updateDepartment(id){
            navigator(`/edit-department/${id}`);
        }
    
        function removeDepartment(id)
        {
            console.log(id);
    
            deleteDepartment(id).then((response) => {
    
                getAllDepartment();
    
            }).catch(error => {
                console.error(error);
            })
            
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
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                {
                    departments.map((department) => (
                    <tr key={department.id}>
                        <td>{department.id}</td>
                        <td>{department.departmentName}</td>
                        <td>{department.departmentDescription}</td>
                        <td>
                            <button className='btn btn-info' onClick={() => updateDepartment(department.id)}>Update</button>
                            <button type="button" className="btn btn-danger" onClick={() => removeDepartment(department.id)}
                             style={{marginLeft: '10px'}}>Delete</button>
                        </td>
                    </tr>))
                
                }
            </tbody>
            
        </table>
    </div>
  )
}

export default ListDepartmentComponent
