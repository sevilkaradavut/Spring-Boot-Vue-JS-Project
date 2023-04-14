<template>
    <div class="container">
        <h1 class="text-center">Employee List</h1>

        <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Employee ID</th>
      <th scope="col">Employee First Name</th>
      <th scope="col">Employee Last Name</th>
      <th scope="col">Employee Email</th>
    </tr>
  </thead>
  <tbody>
    <tr v-for="employee in employees" v-bind:key="employee.id">
        <th>{{ employee.id }}</th>
        <th>{{ employee.firstName }}</th>
        <th>{{ employee.lastName }}</th>
        <th>{{ employee.email }}</th>
    </tr>
  </tbody>
</table>
    </div>
</template>

<script>
import EmployeeService from '../services/EmployeeService'

export default{
   name: 'empList',
   data(){
    return {
        employees : []
    }

   },
   methods: {
    getEmployees(){
        EmployeeService.getEmployees().then((response) =>{
            this.employees = response.data;
        });
    }
   },
   created() {
        this.getEmployees()
   }

   
}
</script>

