//import { useEffect, useState } from "react";
import { View, Text, StyleSheet, ScrollView, Image } from "react-native";
import BoxDestino from "../Components/BoxDestino";
import Rodape from "../Components/Rodape";
import Subtitulo from "../Components/Subtitulo";
import Titulo from "../Components/Titulo";
import destinoJs from "../Destino";
//import axios from "axios";

export default function Destino() {

    

    return (
        <ScrollView>
            <Titulo />
            <Subtitulo nome="Destino" />
            <Text style={styles.categoria}>Nacionais</Text>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/saopaulo.png')}
                    style={{ width: 366, height: 150 }} />
                <BoxDestino cidade="São Paulo"
                    button="Confira as ofertas!" />
            </View>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/riodejaneiro.png')}
                    style={{ width: 366, height: 150 }} />
                <BoxDestino cidade="Rio de Janeiro"
                    button="Confira as ofertas!" />
            </View>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/belohorizonte.png')}
                    style={{ width: 366, height: 150 }} />
                <BoxDestino cidade="Belo Horizonte"
                    button="Confira as ofertas!" />
            </View>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/salvador.png')}
                    style={{ width: 366, height: 150 }} />
                <BoxDestino cidade="Salvador"
                    button="Confira as ofertas!" />
            </View>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/recife.png')}
                    style={{ width: 366, height: 150 }} />
                <BoxDestino cidade="Recife"
                    button="Confira as ofertas!" />
                    
            </View>
             <Rodape />
        </ScrollView>
    );
}

const styles = StyleSheet.create({
    categoria: {
        color: '#ffd700',
        justifyContent: 'center',
        marginLeft: 20,
        marginVertical: 15,
        fontSize: 30
    },
    container: {
        justifyContent: 'center',
        alignItems: 'center',
        marginVertical: 15
    }
});
Footer