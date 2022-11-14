import { NavigationContainer } from '@react-navigation/native';
import { createMaterialBottomTabNavigator } from '@react-navigation/material-bottom-tabs';
import Destino from './Pages/Destinos';
import { StyleSheet } from 'react-native';
import MaterialCommunityIcons from 'react-native-vector-icons/MaterialCommunityIcons';
import Promocoes from './Pages/Promocoes';


const Tab = createMaterialBottomTabNavigator();

export default function App() {

  return (

    <NavigationContainer>
      <Tab.Navigator style={StyleSheet.navbar} barStyle={{ backgroundColor: '#42b6f5' }}>
        <Tab.Screen name="Home" component={Home} options={{
          tabBarIcon: ({ color }) => (
            <MaterialCommunityIcons name="home" color={color} size={26} />
          ),
        }} />
        <Tab.Screen name="Destinos" component={Destinos} options={{
          tabBarIcon: ({ color }) => (
            <MaterialCommunityIcons name="map" color={color} size={26} />
          ),
        }} />
        <Tab.Screen name="Promoções" component={Promocoes} options={{
          tabBarIcon: ({ color }) => (
            <MaterialCommunityIcons name="shopping" color={color} size={26} />
          ),
        }} />
      </Tab.Navigator>
    </NavigationContainer>

  );
}