import { useState } from 'react'

import ListEmployeeComponent from './components/ListEmployeeComponent'
import HeaderComponent from './components/HeaderComponent'
import FooterComponent from './components/FooterComponent'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <HeaderComponent/>
      <ListEmployeeComponent />
      <FooterComponent/>
    </>
  )
}

export default App
